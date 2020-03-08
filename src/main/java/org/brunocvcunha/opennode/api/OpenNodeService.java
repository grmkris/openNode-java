/**
 * Copyright (C) 2017 Bruno Candido Volpato da Cunha (brunocvcunha@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.brunocvcunha.opennode.api;

import java.util.List;

import org.brunocvcunha.opennode.api.model.OpenNodeResponse;
import org.brunocvcunha.opennode.api.model.payments.Charge;
import org.brunocvcunha.opennode.api.model.payments.ChargeDecode;
import org.brunocvcunha.opennode.api.model.payments.CreateCharge;
import org.brunocvcunha.opennode.api.model.transfers.CreateWithdrawal;
import org.brunocvcunha.opennode.api.model.transfers.Withdrawal;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface OpenNodeService {

        
    // payments
    @POST("charges")
    Call<OpenNodeResponse<Charge>> createCharge(@Body CreateCharge charge);

    @GET("charges")
    Call<OpenNodeResponse<List<Charge>>> listCharges();
    
    @GET("charge/{id}")
    Call<OpenNodeResponse<Charge>> getCharge(@Path("id") String id);

    @POST("charge/decode")
    Call<OpenNodeResponse<ChargeDecode>> decodeCharge(@Body String bolt11String);

    // withdrawals
    @POST("withdrawals")
    Call<OpenNodeResponse<Withdrawal>> createWithdrawal(@Body CreateWithdrawal withdrawal);

    @GET("withdrawals")
    Call<OpenNodeResponse<List<Withdrawal>>> listWithdrawal();

    @GET("withdrawal/{id}")
    Call <OpenNodeResponse<Withdrawal>> getWithdrawal(@Path("id") String id);

}
