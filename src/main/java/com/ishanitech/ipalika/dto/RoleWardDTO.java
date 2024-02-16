package com.ishanitech.ipalika.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoleWardDTO {
	private Integer role;
	private Integer wardNumber;
	private UrlObject urlObject;
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class UrlObject {
		private Boolean goBack;
		private Integer wardNo;
		private Integer prevLastItemId;
		private Integer lastSeenId;
		private String searchKey;
		private String toleName;
		private Integer currentPage;
		private Integer pageLimit;
		private String backFrom;

	}
}
