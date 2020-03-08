package org.brunocvcunha.opennode.api.model.transfers;

import com.google.gson.annotations.SerializedName;

public enum WithdrawalStatus {
    @SerializedName("pending")
    PENDING,
    @SerializedName("confirmed")
    CONFIRMED,
    @SerializedName("failed")
    FAILED
}
