package com.acorn.finalPrj.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO {

	int storeCode;
	String storeName;
	String storeCategory;
	String storeImage;
	String storeAddress;
	String storePhone;
	int zzimCount;
	int reviewCount;
	double storeRating;
	String storeDescription;
	int minOrderPrice;
	int deliveryFee;
	String operatingTime;
	String deliveryArea;
	boolean storeStatus;
}
