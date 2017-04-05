package vip.doctordeng.bbs.common;

import vip.doctordeng.bbs.common.constant.RequestResultConstant;

public class RequestResult {
	private String message = "";
	private int resultCode = 0;
	
	public RequestResult(final String message, final int resultCode) {
		this.message = message;
		this.resultCode = resultCode;
	}

	public boolean isSucess() {
		return resultCode == RequestResultConstant.REQUEST_CODE_SUCCESS ? true : false;
	}
	
	public boolean isFail() {
		return resultCode == RequestResultConstant.REQUEST_CODE_FAIL ? true : false;
	}
	
	public boolean isError() {
		return resultCode == RequestResultConstant.REQUEST_CODE_ERROR ? true : false;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
}
