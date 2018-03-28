package com.first.util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.first.entity.Product;

public class Testcx {
/**
 * 3.27
 * 测试类--->主要测试程序功能实现情况
 */
	public Testcx() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
	    //saveProduct();
	   // updateProduct();
	    deleteProduct();

	  }
	
	/*
	 * 
	 * 实现商品删除功能
	 */
	
	public static void deleteProduct() {
		// TODO Auto-generated method stub
		 Session session = null;
		    Transaction tran = null;
		    try {
		      session = HibernateUtil.openSession();
		      tran = session.beginTransaction();
		      // ---------------------------------
		      
		      //查找Product对象
		      Product p = session.load(Product.class, 3);
		      System.out.println(p.getDescription());
		      session.delete(p);
		      
		      
		      //保存
		      session.save(p);
		     

		      // ---------------------------------
		      tran.commit();
		    } catch (Exception e) {
		      e.printStackTrace();
		      tran.rollback();
		    } finally {
		      if (null != session) {
		        session.close();
		      }
		    }
		 

		
	}
	
	/*
	 * 
	 * 实现商品添加功能
	 */
	

	public static void saveProduct(){
	    Session session = null;
	    Transaction tran = null;
	    try {
	      session = HibernateUtil.openSession();
	      tran = session.beginTransaction();
	      // ---------------------------------
	      
	      //创建Product对象
	      Product p = new Product();
	      p.setName("苹果");
	      p.setPrice(16);
	      p.setDescription("酸甜");
	      
	      Product p2 = new Product();
	      p2.setName("桔子");
	      p2.setPrice(22);
	      p2.setDescription("如此地苦");
	      
	      //保存
	      session.save(p);
	      session.save(p2);
	     

	      // ---------------------------------
	      tran.commit();
	    } catch (Exception e) {
	      e.printStackTrace();
	      tran.rollback();
	    } finally {
	      if (null != session) {
	        session.close();
	      }
	    }
	  }
	
	
	/*
	 * 实现商品修改功能
	 * 
	 */
	
	public static void updateProduct() {
	    Session session = null;
	    Transaction tran = null;
	    try {
	      session = HibernateUtil.openSession();
	      tran = session.beginTransaction();
	      // ---------------------------------
	      
	      //查找Product对象
	      Product p = session.load(Product.class, 1);
	      //p.setName("猕猴桃");
	      p.setDescription("这个东西难得的好吃");
	      session.update(p);
	      System.out.println(p.getDescription());
	      
	      
	      //保存
	      session.save(p);
	     

	      // ---------------------------------
	      tran.commit();
	    } catch (Exception e) {
	      e.printStackTrace();
	      tran.rollback();
	    } finally {
	      if (null != session) {
	        session.close();
	      }
	    }
	  }

}
