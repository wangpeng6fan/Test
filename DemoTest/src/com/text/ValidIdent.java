package com.text;
/*
 * 判断标识符的个数----Character类
 * isJavaIdentifierStart()---->判断代码点(codepoint)对应的字符是否可以作为Java标识符的首字符；
 * isJavaIdentifierPart()----->判断代码点(codepoint)对应的字符是否可以作为Java标识符的一部分。
 */
public class ValidIdent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int startNum=0;
         int partNum=0;
         for(int i=0x0000; i<= 0x10ffff;i++){
        	 
        	 if(Character.isJavaIdentifierStart(i)){
        		 
        		 startNum++;
        	 }
             if(Character.isJavaIdentifierPart(i)){
        		 
        		 partNum++;
        	 }
         }
         
         System.out.println("Unicode字符集个数："+(0x10ffff+1));
         System.out.println("可作为标识符首字符个数："+startNum);
         System.out.println("可作为标识符一部分的字符个数："+partNum);
         System.out.println("二者之差："+(partNum-startNum));
	}

}
