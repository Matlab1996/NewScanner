package newscanner;

import java.util.ResourceBundle;

import rx.subjects.BehaviorSubject;

public class settings {
    public static BehaviorSubject<Integer> brightness = BehaviorSubject.create(0);
    public static BehaviorSubject<Integer> contrast = BehaviorSubject.create(32);
    public static BehaviorSubject<Integer> saturation = BehaviorSubject.create(60);
    public static BehaviorSubject<Integer> sharpness = BehaviorSubject.create(2);
    public static BehaviorSubject<Integer> hue = BehaviorSubject.create(0);
    public static BehaviorSubject<Integer> exposure = BehaviorSubject.create(-6);
    public static BehaviorSubject<Integer> gamma = BehaviorSubject.create(100);
    public static BehaviorSubject<Integer> gain = BehaviorSubject.create(0);
    public static BehaviorSubject<Integer> upper = BehaviorSubject.create(100);
    public static BehaviorSubject<Integer> minArea = BehaviorSubject.create(0);
    public static BehaviorSubject<Integer> maxArea = BehaviorSubject.create(100);
    
    public static BehaviorSubject<ResourceBundle> bundle = BehaviorSubject.create(ResourceBundle.getBundle("properties/global_ru"));
    
    public static class CaptureSize  {
    	final int w;
    	final int h;
    	public CaptureSize (int w, int h){
    		this.w = w;
    		this.h = h;
    	}
    }
}



