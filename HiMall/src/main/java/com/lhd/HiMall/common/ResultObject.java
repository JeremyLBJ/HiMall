package com.lhd.HiMall.common;

import java.io.Serializable;

public class ResultObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long count = 0L ;
	private Object data ;
	
	
	
	public ResultObject(Long count, Object data) {
		super();
		this.count = count;
		this.data = data;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResultObject [count=" + count + ", data=" + data + "]";
	}
	
}
