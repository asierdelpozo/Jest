package io.searchbox.client;


import io.searchbox.Action;

import java.io.IOException;


/**
 * @author Dogukan Sonmez
 */


public interface ElasticSearchClient {

    ElasticSearchResult execute(Action clientRequest) throws IOException;

    <T> T executeAsync(Action clientRequest);

    void shutdownClient();

}
