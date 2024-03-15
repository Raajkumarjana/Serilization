package org.sample;

import java.util.ArrayList;

public class Batters {
	
	private ArrayList<Batter> Batter;

	public ArrayList<Batter> getBatter() {
		return Batter;
	}

	public void setBatter(ArrayList<Batter> batter) {
		Batter = batter;
	}

	public Batters(ArrayList<org.sample.Batter> batter) {
		super();
		Batter = batter;
	}

}
