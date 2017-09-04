package com.ln.rxjavawithretrofit.api.service;


import com.google.gson.JsonArray;
import com.ln.rxjavawithretrofit.api.response.GitHubUser;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Retrofit turns your HTTP API into a Java interface.
 */
public interface GitHubUserService {

    @GET("users")
    Observable<List<GitHubUser>> getGitHubUser();

}
