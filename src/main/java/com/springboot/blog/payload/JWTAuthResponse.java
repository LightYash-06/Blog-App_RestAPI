package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor*/
public class JWTAuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	@Override
	public String toString() {
		return "JWTAuthResponse [accessToken=" + accessToken + ", tokenType=" + tokenType + ", getAccessToken()="
				+ getAccessToken() + ", getTokenType()=" + getTokenType() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public JWTAuthResponse(String accessToken, String tokenType) {
		super();
		this.accessToken = accessToken;
		this.tokenType = tokenType;
	}
	public JWTAuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}