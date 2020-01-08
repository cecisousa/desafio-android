package com.example.github_api_concrete.model.data.remote;

import com.example.github_api_concrete.model.pojo.RepositoriesResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitHubAPI {

    @GET("repositories?")
    Observable<RepositoriesResult> getAllRepositories(@Query("language") String language,
                                                      @Query("sort") String sort,
                                                      @Query("page") int page);
}