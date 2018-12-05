package info.smartkit.cloud.streaming.services;

import eu.bittrade.libs.steemj.SteemJ;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.models.Event;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface GitlabService {
    CompletableFuture<GitLabApi> config(String uri, String privateToken);
    CompletableFuture<List<Event>> getEvents() throws InterruptedException, GitLabApiException;
}
