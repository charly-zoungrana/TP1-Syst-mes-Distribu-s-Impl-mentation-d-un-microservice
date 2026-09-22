package com.zoungrana.charly.tp1implementationmicroservice.exceptions;
import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import graphql.schema.DataFetchingEnvironment;
import org.jspecify.annotations.Nullable;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 22:02
 */

@Component
public class CustomDataFetcherExceptionResolver extends DataFetcherExceptionResolverAdapter {

    @Override
    protected @Nullable GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        return new GraphQLError() {
            @Override
            public String getMessage() {
                return ex.getMessage();
            }

            @Override
            public List<SourceLocation> getLocations() {
                return List.of();
            }

            @Override
            public ErrorClassification getErrorType() {
                return null;
            }
        };
    }
}
