package com.kylin.pattern.builder.androidbuilder;


public class Test {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.setMessage("确认退出吗？");
		builder.setTitle("提示");
//		builder.setPositiveButton("确定", new OnClickListener() {
//			
//			@Override
//			public void onClick(DialogInterface dialog, int which) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		builder.setNegativeButton("取消", new OnClickListener() {
//			
//			@Override
//			public void onClick(DialogInterface dialog, int which) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		builder.create().show();
	}

}
