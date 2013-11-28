package com.gmat.app.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ChapterEntity implements Serializable {
	private int sr;
	private String chapterName;
	private String chapterDetail;
	private int fav;

	public int getSr() {
		return sr;
	}

	public void setSr(int sr) {
		this.sr = sr;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chaperName) {
		this.chapterName = chaperName;
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
