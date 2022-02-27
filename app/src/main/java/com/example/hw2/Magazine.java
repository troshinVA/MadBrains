package com.example.hw2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"},
        d2 = {"Lcom/example/hw2/Magazine;", "Lcom/example/hw2/Publication;", "price", "", "wordCount", "", "(DI)V", "getPrice", "()D", "setPrice", "(D)V", "getWordCount", "()I", "setWordCount", "(I)V", "getType", "", "hw2.app"}
)
public final class Magazine implements Publication {
    private double price;
    private int wordCount;

    @NotNull
    public String getType() {
        return "Magazine";
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double var1) {
        this.price = var1;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public void setWordCount(int var1) {
        this.wordCount = var1;
    }

    public Magazine(double price, int wordCount) {
        this.price = price;
        this.wordCount = wordCount;
    }

    // $FF: synthetic method
    public Magazine(double var1, int var3, int var4, DefaultConstructorMarker var5) {
        this(var1, var3);

        if ((var4 & 1) != 0) {
            var1 = 30.0D;
        }

        if ((var4 & 2) != 0) {
            var3 = 300;
        }

    }

    public Magazine() {
        this(0.0D, 0, 3, (DefaultConstructorMarker)null);
    }
}
