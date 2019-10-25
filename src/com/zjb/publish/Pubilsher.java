package com.zjb.publish;

import java.util.ArrayList;
import java.util.List;

public class Pubilsher {
	
	private static List<Subscriber> sbuscribers = new ArrayList<>();
	
	public static void add(Subscriber sb) {
		sbuscribers.add(sb);
	}
	
	public static void remove(Subscriber sb) {
		sbuscribers.remove(sb);
	}
	
	public static void publish() {
		System.out.println("学校发布了一条消息");
		
		for(Subscriber sb : sbuscribers) {
			sb.doAction();
		}
	}

}
