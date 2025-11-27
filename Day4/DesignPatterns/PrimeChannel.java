package com.example.Day4.DesignPatterns;

public class PrimeChannel extends Video{
	
	public PrimeChannel(ProcessingVideoQuality quality) {
		super(quality);
	}
	
	@Override
	public void playVideo() {
		System.out.println("Prime will play videos in ");
		quality.processVideo();
	}

}
