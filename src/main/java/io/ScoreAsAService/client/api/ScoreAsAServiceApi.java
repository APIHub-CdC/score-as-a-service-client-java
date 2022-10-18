package io.ScoreAsAService.client.api;

import io.ScoreAsAService.client.ApiCallback;
import io.ScoreAsAService.client.ApiClient;
import io.ScoreAsAService.client.ApiException;
import io.ScoreAsAService.client.ApiResponse;
import io.ScoreAsAService.client.Configuration;
import io.ScoreAsAService.client.Pair;
import io.ScoreAsAService.client.ProgressRequestBody;
import io.ScoreAsAService.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.ScoreAsAService.client.model.Errores;
import io.ScoreAsAService.client.model.RequestConsulta;
import io.ScoreAsAService.client.model.RequestDatos;
import io.ScoreAsAService.client.model.RequestDatosHistoricos;
import io.ScoreAsAService.client.model.RequestScorePromedio;
import io.ScoreAsAService.client.model.RequestValidaScore;
import io.ScoreAsAService.client.model.ResponseConsulta;
import io.ScoreAsAService.client.model.ResponseDatos;
import io.ScoreAsAService.client.model.ResponseDatosHistoricos;
import io.ScoreAsAService.client.model.ResponseScorePromedio;
import io.ScoreAsAService.client.model.ResponseValidaScore;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreAsAServiceApi {
    private ApiClient apiClient;

    public ScoreAsAServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ScoreAsAServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for datosHistoricosPost
     
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call datosHistoricosPostCall(String xApiKey, String username, String password, RequestDatosHistoricos body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/datosHistoricos";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call datosHistoricosPostValidateBeforeCall(String xApiKey, String username, String password, RequestDatosHistoricos body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
      
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling datosHistoricosPost(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling datosHistoricosPost(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling datosHistoricosPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling datosHistoricosPost(Async)");
        }
        

        Call call = datosHistoricosPostCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * peticion para obtener sus datos Historicos
     * Obtener sus datos Historicos
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ResponseDatosHistoricos
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseDatosHistoricos datosHistoricosPost( String xApiKey, String username, String password, RequestDatosHistoricos body) throws ApiException {
        ApiResponse<ResponseDatosHistoricos> resp = datosHistoricosPostWithHttpInfo( xApiKey, username, password, body);
        return resp.getData();
    }

    /**
     * peticion para obtener sus datos Historicos
     * Obtener sus datos Historicos
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ApiResponse&lt;ResponseDatosHistoricos&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseDatosHistoricos> datosHistoricosPostWithHttpInfo( String xApiKey, String username, String password, RequestDatosHistoricos body) throws ApiException {
        Call call = datosHistoricosPostValidateBeforeCall( xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseDatosHistoricos>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * peticion para obtener sus datos Historicos (asynchronously)
     * Obtener sus datos Historicos
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call datosHistoricosPostAsync( String xApiKey, String username, String password, RequestDatosHistoricos body, final ApiCallback<ResponseDatosHistoricos> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = datosHistoricosPostValidateBeforeCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseDatosHistoricos>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    /**
     * Build call for obtenFechasPost
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call obtenFechasPostCall( String xApiKey, String username, String password, RequestDatos body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/obtenFechas";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call obtenFechasPostValidateBeforeCall( String xApiKey, String username, String password, RequestDatos body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
   
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling obtenFechasPost(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling obtenFechasPost(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling obtenFechasPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling obtenFechasPost(Async)");
        }
        

        Call call = obtenFechasPostCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene las fechas de su ultima consulta de score y la proxima actualizacion
     * obtiene las fechas de su ultima consulta de score y la proxima actualizacion
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ResponseDatos
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseDatos obtenFechasPost( String xApiKey, String username, String password, RequestDatos body) throws ApiException {
        ApiResponse<ResponseDatos> resp = obtenFechasPostWithHttpInfo( xApiKey, username, password, body);
        return resp.getData();
    }

    /**
     * obtiene las fechas de su ultima consulta de score y la proxima actualizacion
     * obtiene las fechas de su ultima consulta de score y la proxima actualizacion
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ApiResponse&lt;ResponseDatos&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseDatos> obtenFechasPostWithHttpInfo( String xApiKey, String username, String password, RequestDatos body) throws ApiException {
        Call call = obtenFechasPostValidateBeforeCall( xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseDatos>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene las fechas de su ultima consulta de score y la proxima actualizacion (asynchronously)
     * obtiene las fechas de su ultima consulta de score y la proxima actualizacion
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call obtenFechasPostAsync( String xApiKey, String username, String password, RequestDatos body, final ApiCallback<ResponseDatos> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = obtenFechasPostValidateBeforeCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseDatos>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    /**
     * Build call for obtenPromediosPost
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call obtenPromediosPostCall( String xApiKey, String username, String password, RequestScorePromedio body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/obtenPromedios";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call obtenPromediosPostValidateBeforeCall( String xApiKey, String username, String password, RequestScorePromedio body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling obtenPromediosPost(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling obtenPromediosPost(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling obtenPromediosPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling obtenPromediosPost(Async)");
        }
        

        Call call = obtenPromediosPostCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * peticion que obtiene promedios.
     * por generacion, edo y nacional
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ResponseScorePromedio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseScorePromedio obtenPromediosPost( String xApiKey, String username, String password, RequestScorePromedio body) throws ApiException {
        ApiResponse<ResponseScorePromedio> resp = obtenPromediosPostWithHttpInfo( xApiKey, username, password, body);
        return resp.getData();
    }

    /**
     * peticion que obtiene promedios.
     * por generacion, edo y nacional
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ApiResponse&lt;ResponseScorePromedio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseScorePromedio> obtenPromediosPostWithHttpInfo( String xApiKey, String username, String password, RequestScorePromedio body) throws ApiException {
        Call call = obtenPromediosPostValidateBeforeCall( xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseScorePromedio>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * peticion que obtiene promedios. (asynchronously)
     * por generacion, edo y nacional
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call obtenPromediosPostAsync( String xApiKey, String username, String password, RequestScorePromedio body, final ApiCallback<ResponseScorePromedio> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = obtenPromediosPostValidateBeforeCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseScorePromedio>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    /**
     * Build call for obtenerConsultasPost
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call obtenerConsultasPostCall( String xApiKey, String username, String password, RequestConsulta body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/obtenerConsultas";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call obtenerConsultasPostValidateBeforeCall( String xApiKey, String username, String password, RequestConsulta body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
             
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling obtenerConsultasPost(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling obtenerConsultasPost(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling obtenerConsultasPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling obtenerConsultasPost(Async)");
        }
        

        Call call = obtenerConsultasPostCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * peticion para obtener las consultas que le han echo
     * obtener las consultas que le han echo
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ResponseConsulta
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseConsulta obtenerConsultasPost( String xApiKey, String username, String password, RequestConsulta body) throws ApiException {
        ApiResponse<ResponseConsulta> resp = obtenerConsultasPostWithHttpInfo( xApiKey, username, password, body);
        return resp.getData();
    }

    /**
     * peticion para obtener las consultas que le han echo
     * obtener las consultas que le han echo
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ApiResponse&lt;ResponseConsulta&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseConsulta> obtenerConsultasPostWithHttpInfo( String xApiKey, String username, String password, RequestConsulta body) throws ApiException {
        Call call = obtenerConsultasPostValidateBeforeCall( xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseConsulta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * peticion para obtener las consultas que le han echo (asynchronously)
     * obtener las consultas que le han echo
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call obtenerConsultasPostAsync( String xApiKey, String username, String password, RequestConsulta body, final ApiCallback<ResponseConsulta> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = obtenerConsultasPostValidateBeforeCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseConsulta>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    /**
     * Build call for validaScorePost
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call validaScorePostCall( String xApiKey, String username, String password, RequestValidaScore body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/validaScore";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call validaScorePostValidateBeforeCall( String xApiKey, String username, String password, RequestValidaScore body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling validaScorePost(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling validaScorePost(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling validaScorePost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling validaScorePost(Async)");
        }
        

        Call call = validaScorePostCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * peticion que valida si tiene score
     * Valida si tiene score
     
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ResponseValidaScore
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseValidaScore validaScorePost( String xApiKey, String username, String password, RequestValidaScore body) throws ApiException {
        ApiResponse<ResponseValidaScore> resp = validaScorePostWithHttpInfo( xApiKey, username, password, body);
        return resp.getData();
    }

    /**
     * peticion que valida si tiene score
     * Valida si tiene score
     
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @return ApiResponse&lt;ResponseValidaScore&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseValidaScore> validaScorePostWithHttpInfo( String xApiKey, String username, String password, RequestValidaScore body) throws ApiException {
        Call call = validaScorePostValidateBeforeCall( xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseValidaScore>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * peticion que valida si tiene score (asynchronously)
     * Valida si tiene score
     
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body Solicitud para obtener Consultas (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call validaScorePostAsync( String xApiKey, String username, String password, RequestValidaScore body, final ApiCallback<ResponseValidaScore> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = validaScorePostValidateBeforeCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseValidaScore>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
