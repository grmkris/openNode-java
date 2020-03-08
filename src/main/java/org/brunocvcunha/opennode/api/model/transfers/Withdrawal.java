package org.brunocvcunha.opennode.api.model.transfers;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Withdrawal {

    String id;
    WithdrawalType type;
    int amount;
    String reference;
    int fee;
    WithdrawalStatus status;
    @SerializedName("processed_at")
    Long processedAt;

}
