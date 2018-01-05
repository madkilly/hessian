/**
 * 
 */
package com.caucho.hessian.util;

/**
 * @author zhukai
 *
 */
public class InnerClassLoaderHolder {
	
	private volatile static InnerClassLoaderHolder instance;
	
	public static InnerClassLoaderHolder getinstance() {
		if(instance==null) {
			synchronized(InnerClassLoaderHolder.class) {
				if(instance==null) {
					instance = new InnerClassLoaderHolder();
				}
			}
		}
		return instance;
	}
	
	public ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

}
