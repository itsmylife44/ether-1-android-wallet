package rehanced.com.simpleetherwallet.network;

import android.content.Context;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Callback;
import rehanced.com.simpleetherwallet.interfaces.LastIconLoaded;
import rehanced.com.simpleetherwallet.interfaces.StorableWallet;

public interface NetworkAPI {
    public void getPriceChart(long starttime, int period, boolean usd, Callback b) throws IOException;

    public void getInternalTransactions(String address, Callback b, boolean force) throws IOException;

    public void getNormalTransactions(String address, Callback b, boolean force) throws IOException;

    public void getEtherPrice(Callback b) throws IOException;

    public void getGasPrice(Callback b) throws IOException;

    public void getTokenBalances(String address, Callback b, boolean force) throws IOException;

    public void loadTokenIcon(final Context c, String tokenName, final boolean lastToken, final LastIconLoaded callback) throws IOException;

    public void getGasLimitEstimate(String to, Callback b) throws IOException;

    public void getBalance(String address, Callback b) throws IOException;

    public void getNonceForAddress(String address, Callback b) throws IOException;

    public void getPriceConversionRates(String currencyConversion, Callback b) throws IOException;

    public void getBalances(ArrayList<StorableWallet> addresses, Callback b) throws IOException;

    public void forwardTransaction(String raw, Callback b) throws IOException;
}
