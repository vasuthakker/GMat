package com.gmat.app.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ChapterEntity implements Serializable {
	private int sr;
	private String chaperName;
	private String chapterDetail;
	private int fav;

	public int getSr() {
		return sr;
	}

	public void setSr(int sr) {
		this.sr = sr;
	}

	public String getChaperName() {
		return chaperName;
	}

	public void setChaperName(String chaperName) {
		this.chaperName = chaperName;
	}

	public String getChapterDetail() {
		return chapterDetail;
	}

	public void setChapterDetail(String chapterDetail) {
		this.chapterDetail = chapterDetail;
	}

	public int getFav() {
		return fav;
	}

	public void setFav(int fav) {
		this.fav = fav;
	}

}
