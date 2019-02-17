package com.ar.jni;

public class JNIExample {
	public native int echo(int i);
	public native boolean echo(boolean b);
	public native String echo(String str);
	public native int sum(int[] arr);
	
	public static void main(String[] args) {
		System.loadLibrary("Jnilib");
		JNIExample sample = new JNIExample();
		int square = sample.echo(5);
		boolean bool = sample.echo(true);
		String text = sample.echo("java");
		int sum = sample.sum(new int[] {1, 1, 2, 3, 5, 8, 13});
		System.out.println("intMethod: " + square);
		System.out.println("booleanMethod: " + bool);
		System.out.println("stringMethod: " + text);
		System.out.println("intArrayMethod: " + sum);
	}
}
