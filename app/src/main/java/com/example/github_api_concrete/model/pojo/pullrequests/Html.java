package com.example.github_api_concrete.model.pojo.pullrequests;

import com.google.gson.annotations.SerializedName;

public class Html{

	@SerializedName("href")
	private String href;

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	@Override
 	public String toString(){
		return 
			"Html{" + 
			"href = '" + href + '\'' + 
			"}";
		}
}