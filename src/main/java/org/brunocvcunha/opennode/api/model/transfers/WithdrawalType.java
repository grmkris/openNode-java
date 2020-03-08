package org.brunocvcunha.opennode.api.model.transfers;

import com.google.gson.annotations.SerializedName;

public enum WithdrawalType{
    @SerializedName("ln")
    LN, 
    @SerializedName("chain")
    CHAIN
}