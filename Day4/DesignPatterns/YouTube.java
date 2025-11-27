package com.example.Day4.DesignPatterns;

public class YouTube extends Video{
	
	public YouTube(ProcessingVideoQuality quality) {
		super(quality);
	}

	@Override
	public void playVideo() {
		System.out.print("YouTube will play videos in");
		quality.processVideo();
		
	}

}
