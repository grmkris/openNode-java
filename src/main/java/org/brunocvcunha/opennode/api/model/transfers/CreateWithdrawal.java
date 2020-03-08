package org.brunocvcunha.opennode.api.model.transfers;

import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateWithdrawal {
    WithdrawalType type; //ln / chain
    int amount; //in satoshis, only required when type is chain
    String address;  //bolt11 invoice or bitcoin address
    @SerializedName("callback_url")
    String callbackUrl; // withdrawal webhook 
}
