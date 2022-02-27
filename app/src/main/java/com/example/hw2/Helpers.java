package com.example.hw2;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.hw2.Action.Login;
import com.example.hw2.Action.Logout;
import com.example.hw2.Action.Registration;
import java.text.NumberFormat;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 2,
        d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"},
        d2 = {"auth", "", "user", "Lcom/example/hw2/User;", "updateCache", "Lkotlin/Function0;", "buy", "publication", "Lcom/example/hw2/Publication;", "doAction", "action", "Lcom/example/hw2/Action;", "getFormattedPrice", "", "price", "", "printPublicationInfo", "HW1.app"}
)
public final class HelpersKt {
    @NotNull
    public static final String getFormattedPrice(double price) {
        NumberFormat var10000 = NumberFormat.getCurrencyInstance();
        Intrinsics.checkNotNullExpressionValue(var10000, "NumberFormat.getCurrencyInstance()");
        NumberFormat format = var10000;
        format.setMaximumFractionDigits(2);
        format.setCurrency(Currency.getInstance("EUR"));
        String var3 = format.format(price);
        Intrinsics.checkNotNullExpressionValue(var3, "format.format(price)");
        return var3;
    }

    public static final void printPublicationInfo(@NotNull Publication publication) {
        Intrinsics.checkNotNullParameter(publication, "publication");
        String var1 = Reflection.getOrCreateKotlinClass(publication.getClass()).getSimpleName() + "'s type: " + publication.getType();
        System.out.println(var1);
        var1 = Reflection.getOrCreateKotlinClass(publication.getClass()).getSimpleName() + "'s price: " + getFormattedPrice(publication.getPrice());
        System.out.println(var1);
        var1 = Reflection.getOrCreateKotlinClass(publication.getClass()).getSimpleName() + "'s word quantity: " + publication.getWordCount() + " \n";
        System.out.println(var1);
    }

    public static final void buy(@Nullable Publication publication) {
        String var1 = "The purchase is complete. The purchase amount was " + (publication != null ? publication.getPrice() : null) + '.';
        System.out.println(var1);
    }

    public static final void auth(@NotNull User user, @NotNull Function0 updateCache) {
        int $i$f$auth = 0;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(updateCache, "updateCache");

        try {
            UserKt.isAdult(user);
            updateCache.invoke();
            HW1Kt.getAuthCallback().authSuccess();
        } catch (Exception var5) {
            String var4 = var5.getMessage();
            System.out.println(var4);
            HW1Kt.getAuthCallback().authFailed();
        }

    }

    public static final void updateCache() {
        String var0 = "Cache is updated";
        System.out.println(var0);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static final void doAction(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String var2;
        if (action instanceof Action.Registration) {
            var2 = "Registration started";
            System.out.println(var2);
        } else if (action instanceof Action.Login) {
            var2 = "Login started";
            System.out.println(var2);
            User user$iv = ((Action.Login)action).getUser();
            boolean var3 = false;

            try {
                UserKt.isAdult(user$iv);
                boolean var4 = false;
                updateCache();
                HW1Kt.getAuthCallback().authSuccess();
            } catch (Exception var6) {
                String var5 = var6.getMessage();
                System.out.println(var5);
                HW1Kt.getAuthCallback().authFailed();
            }
        } else if (action instanceof Action.Logout) {
            var2 = "Logout started \n";
            System.out.println(var2);
        }

    }
}
