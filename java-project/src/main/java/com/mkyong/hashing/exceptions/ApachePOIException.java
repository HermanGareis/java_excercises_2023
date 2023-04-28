package com.mkyong.hashing.exceptions;

public class ApachePOIException {
	@SuppressWarnings("unused")
	private String exceptionMessage;

	private ApachePOIException() {
	}

	public static class ApachePOIX extends BaseException {

		private static final long serialVersionUID = 1L;

		public ApachePOIX(String msg) {
			super(msg);
		}

	}
}
