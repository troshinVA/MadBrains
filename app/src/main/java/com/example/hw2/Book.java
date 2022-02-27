package com.example.hw2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"},
        d2 = {"Lcom/example/hw2/Book;", "Lcom/example/hw2/Publication;", "price", "", "wordCount", "", "(DI)V", "getPrice", "()D", "setPrice", "(D)V", "getWordCount", "()I", "setWordCount", "(I)V", "equals", "", "other", "", "getType", "", "HW1.app"}
)
public final class Book implements Publication {
    private double price;
    private int wordCount;

    @NotNull
    public String getType() {
        return this.getWordCount() < 1000 ? "Flash Fiction" : (this.getWordCount() > 7500 ? "Novel" : "Short Story");
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof Book && ((Book)other).getPrice() == this.getPrice() && ((Book)other).getWordCount() == this.getWordCount();
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

    public Book(double price, int wordCount) {
        this.price = price;
        this.wordCount = wordCount;
    }

    // $FF: synthetic method
    public Book(double var1, int var3, int var4, DefaultConstructorMarker var5) {
        this(var1, var3);

        if ((var4 & 1) != 0) {
            var1 = 50.0D;
        }

        if ((var4 & 2) != 0) {
            var3 = 2000;
        }
    }

    public Book() {
        this(0.0D, 0, 3, (DefaultConstructorMarker)null);
    }
}
