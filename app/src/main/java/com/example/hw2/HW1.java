package com.example.hw2;

import android.os.Build;

import androidx.annotation.RequiresApi;
import com.example.hw2.Action.Login;
import com.example.hw2.Action.Logout;
import com.example.hw2.Action.Registration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 6, 0},
        k = 2,
        d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"},
        d2 = {"authCallback", "Lcom/example/hw2/AuthCallback;", "getAuthCallback", "()Lcom/example/hw2/AuthCallback;", "main", "", "HW1.app"}
)
public final class HW1Kt {
    @NotNull
    private static final AuthCallback authCallback = (AuthCallback)(new AuthCallback() {
        public void authSuccess() {
            String var1 = "Auth success";
            System.out.println(var1);
        }

        public void authFailed() {
            String var1 = "Auth failed";
            System.out.println(var1);
        }
    });

    @NotNull
    public static AuthCallback getAuthCallback() {
        return authCallback;
    }

    @RequiresApi(26)
    public static void main() {
        Book book1 = new Book(99.9D, 6000);
        HelpersKt.printPublicationInfo((Publication)book1);
        Book book2 = new Book(1000.12339D, 8000);
        HelpersKt.printPublicationInfo((Publication)book2);
        Magazine magazine = new Magazine(50.01D, 500);
        HelpersKt.printPublicationInfo((Publication)magazine);
        book1.equals(book2);
        Book bookNotNull = new Book(100.0D, 500);
        Book bookNull = (Book)null;
        HelpersKt.buy((Publication)bookNull);
        HelpersKt.buy((Publication)bookNotNull);
        Function2 sum = (Function2)null.INSTANCE;
        sum.invoke(51, 3);
        User user1 = new User(0, (String)null, 0, (Type)null, 15, (DefaultConstructorMarker)null);
        String var7 = "Start time " + user1.getStartTime();
        System.out.println(var7);
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        var7 = "Start time after delay " + user1.getStartTime() + " \n";
        System.out.println(var7);
        List usersMutableList = CollectionsKt.mutableListOf(new User[]{new User(0, (String)null, 0, (Type)null, 15, (DefaultConstructorMarker)null)});
        List $this$apply = usersMutableList;
        boolean $i$f$map = false;
        int i = 2;

        for(byte var12 = 5; i <= var12; ++i) {
            String var10004 = "Name_" + i;
            byte var13 = 5;
            IntRange var31 = new IntRange(var13, 80);
            int var10005 = RangesKt.random(var31, (Random)Random.Default);
            Type[] var32 = Type.values();
            $this$apply.add(new User(i, var10004, var10005, (Type)ArraysKt.random(var32, (Random)Random.Default)));
        }

        String var8 = "All users: " + usersMutableList;
        System.out.println(var8);
        StringBuilder var10000 = (new StringBuilder()).append("Full access users : ");
        Iterable $this$filter$iv = (Iterable)usersMutableList;
        StringBuilder var18 = var10000;
        boolean $i$f$filter = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        boolean $i$f$filterTo = false;
        Iterator var33 = $this$filter$iv.iterator();

        while(var33.hasNext()) {
            Object element$iv$iv = var33.next();
            User it = (User)element$iv$iv;
            boolean var16 = false;
            if (it.getType() == Type.FULL) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        List var19 = (List)destination$iv$iv;
        var8 = var18.append(var19).append(" \n").toString();
        System.out.println(var8);
        Iterable $this$map$iv = (Iterable)usersMutableList;
        $i$f$map = false;
        boolean $i$f$mapTo = false;
        Iterator var35 = $this$map$iv.iterator();

        while(var35.hasNext()) {
            Object item$iv$iv = var35.next();
            User it = (User)item$iv$iv;
            boolean var17 = false;
            String var38 = it.getName();
            destination$iv$iv.add(var38);
        }

        List nameList = (List)destination$iv$iv;
        String var25 = "List of names: " + nameList;
        System.out.println(var25);
        var25 = "First user: " + (String)CollectionsKt.first(nameList) + " \nLast user: " + (String)CollectionsKt.last(nameList) + " \n";
        System.out.println(var25);
        Iterator var26 = usersMutableList.iterator();

        while(var26.hasNext()) {
            User user = (User)var26.next();
            HelpersKt.doAction((Action)Registration.INSTANCE);
            HelpersKt.doAction((Action)(new Login(user)));
            HelpersKt.doAction((Action)Logout.INSTANCE);
        }

    }

    // $FF: synthetic method
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] var0) {
        main();
    }
}
