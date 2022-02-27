package com.example.hw2;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"},
        d2 = {"Lcom/example/hw2/Publication;", "", "price", "", "getPrice", "()D", "setPrice", "(D)V", "wordCount", "", "getWordCount", "()I", "setWordCount", "(I)V", "getType", "", "HW1.app"}
)
public interface Publication {
    double getPrice();

    void setPrice(double var1);

    int getWordCount();

    void setWordCount(int var1);

    @NotNull
    String getType();
}
