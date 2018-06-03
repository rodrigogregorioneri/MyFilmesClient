package interfaces;

import java.util.List;

import model.AutenticarModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Autenticacao {

     public static final String API_URL = "https://api.themoviedb.org/3";

     public static final String TOKEN = "a27afd6f293e97eac284b35f526f7214";

    @GET("/authentication/token/new?api_key="+TOKEN)
    Call<List<AutenticarModel>> autenticacaoAPI();

}
