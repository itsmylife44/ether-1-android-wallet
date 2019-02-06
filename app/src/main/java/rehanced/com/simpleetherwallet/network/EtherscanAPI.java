package rehanced.com.simpleetherwallet.network;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Callback;
import rehanced.com.simpleetherwallet.interfaces.LastIconLoaded;
import rehanced.com.simpleetherwallet.interfaces.StorableWallet;
import rehanced.com.simpleetherwallet.utils.Key;


public class EtherscanAPI {
    private String token;
    private NetworkAPI network;

    private static EtherscanAPI instance;

    public static EtherscanAPI getInstance() {
        if (instance == null) {
            instance = new EtherscanAPI();
        }
        return instance;
    }

    private EtherscanAPI() {
        token = new Key("").toString();
        network = new ethoNetwork(token);
    }

    public void getPriceChart(long starttime, int period, boolean usd, Callback b) throws IOException {
        this.network.getPriceChart(starttime, period, usd, b);
    }

    public void getInternalTransactions(String address, Callback b, boolean force) throws IOException {
        this.network.getInternalTransactions(address, b, force);
    }

    public void getNormalTransactions(String address, Callback b, boolean force) throws IOException {
        this.network.getNormalTransactions(address, b, force);
    }

    public void getEtherPrice(Callback b) throws IOException {
        this.network.getEtherPrice(b);
    }

    public void getGasPrice(Callback b) throws IOException {
        this.network.getGasPrice(b);
    }

    public void getTokenBalances(String address, Callback b, boolean force) throws IOException {
        this.network.getTokenBalances(address, b, force);
    }

    public void loadTokenIcon(final Context c, String tokenName, final boolean lastToken, final LastIconLoaded callback) throws IOException {
        this.network.loadTokenIcon(c, tokenName, lastToken, callback);
    }

    public void getGasLimitEstimate(String to, Callback b) throws IOException {
        this.network.getGasLimitEstimate(to, b);
    }

    public void getBalance(String address, Callback b) throws IOException {
        this.network.getBalance(address, b);
    }

    public void getNonceForAddress(String address, Callback b) throws IOException {
        this.network.getNonceForAddress(address, b);
    }

    public void getPriceConversionRates(String currencyConversion, Callback b) throws IOException {
        this.network.getPriceConversionRates(currencyConversion, b);
    }

    public void getBalances(ArrayList<StorableWallet> addresses, Callback b) throws IOException {
        this.network.getBalances(addresses, b);
    }

    public void forwardTransaction(String raw, Callback b) throws IOException {
        this.network.forwardTransaction(raw, b);
    }
}
