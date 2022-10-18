package io.ScoreAsAService.client.api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.ScoreAsAService.client.ApiClient;
import io.ScoreAsAService.client.ApiException;
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
import io.ScoreAsAService.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

/**
 * API tests for ScoreAsAServiceApi
 */
public class ScoreAsAServiceApiTest {

    private final ScoreAsAServiceApi api = new ScoreAsAServiceApi();

    private Logger logger = LoggerFactory.getLogger(ScoreAsAServiceApiTest.class.getName());

    private ApiClient apiClient;

    private String xApiKey = "your_api_key";
    private String url = "https://services.circulodecredito.com.mx/v1/scoreAsaService/";
    private String username = "your_username";
    private String password = "your_password";

    @Before()
    public void Setup() {
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
        apiClient.setHttpClient(okHttpClient);
    }

    /**
     * peticion para obtener sus datos Historicos
     *
     * Obtener sus datos Historicos
     *
     * @throws Exception
     *                   if the Api call fails
     */
    @Test
    public void datosHistoricosPostTest() throws Exception {

        RequestDatosHistoricos body = new RequestDatosHistoricos();
        body.setNperscve("000000000");
        try {

            ResponseDatosHistoricos response = api.datosHistoricosPost(this.xApiKey, this.username, this.password,
                    body);

            Assert.assertTrue(response != null);
            if (response != null) {
                logger.info(response.toString());
            }
        } catch (ApiException e) {
            logger.info(e.getResponseBody());
        }
    }

    /**
     * obtiene las fechas de su ultima consulta de score y la proxima actualizacion
     *
     * obtiene las fechas de su ultima consulta de score y la proxima actualizacion
     *
     * @throws Exception
     *                   if the Api call fails
     */
    @Test
    public void obtenFechasPostTest() throws Exception {

        RequestDatos body = new RequestDatos();
        body.setNperscve("000000000");

        try {

            ResponseDatos response = api.obtenFechasPost(this.xApiKey, this.username, this.password, body);

            Assert.assertTrue(response != null);
            if (response != null) {
                logger.info(response.toString());
            }
        } catch (ApiException e) {
            logger.info(e.getResponseBody());
        }
    }

    /**
     * peticion que obtiene promedios.
     *
     * por generacion, edo y nacional
     *
     * @throws Exception
     *                   if the Api call fails
     */
    @Test
    public void obtenPromediosPostTest() throws Exception {

        RequestScorePromedio body = new RequestScorePromedio();
        body.setNperscve("000000000");
        try {

            ResponseScorePromedio response = api.obtenPromediosPost(this.xApiKey, this.username, this.password, body);

            Assert.assertTrue(response != null);
            if (response != null) {
                logger.info(response.toString());
            }
        } catch (ApiException e) {
            logger.info(e.getResponseBody());
        }
    }

    /**
     * peticion para obtener las consultas que le han echo
     *
     * obtener las consultas que le han echo
     *
     * @throws Exception
     *                   if the Api call fails
     */
    @Test
    public void obtenerConsultasPostTest() throws Exception {

        RequestConsulta body = new RequestConsulta();
        body.setNperscve("000000000");
        try {

            ResponseConsulta response = api.obtenerConsultasPost(this.xApiKey, this.username, this.password, body);

            Assert.assertTrue(response != null);
            if (response != null) {
                logger.info(response.toString());
            }
        } catch (ApiException e) {
            logger.info(e.getResponseBody());
        }
    }

    /**
     * peticion que valida si tiene score
     *
     * Valida si tiene score
     *
     * @throws Exception
     *                   if the Api call fails
     */
    @Test
    public void validaScorePostTest() throws Exception {

        RequestValidaScore body = new RequestValidaScore();
        body.setNperscve("000000000");
        try {

            ResponseValidaScore response = api.validaScorePost(this.xApiKey, this.username, this.password, body);

            Assert.assertTrue(response != null);
            if (response != null) {
                logger.info(response.toString());
            }
        } catch (ApiException e) {
            logger.info(e.getResponseBody());
        }
    }

}
