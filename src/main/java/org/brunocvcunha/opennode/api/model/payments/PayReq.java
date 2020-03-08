package org.brunocvcunha.opennode.api.model.payments;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class PayReq {
    String network;
    double amount;
    @SerializedName("pub_key")
    String pubKey;
    String hash;
}