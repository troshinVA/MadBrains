// User.java
package com.example.hw2;

import android.os.Build;

import androidx.annotation.RequiresApi;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"},
        d2 = {"Lcom/example/hw2/User;", "", "id", "", "name", "", "age", "type", "Lcom/example/hw2/Type;", "(ILjava/lang/String;ILcom/example/hw2/Type;)V", "getAge", "()I", "setAge", "(I)V", "getId", "getName", "()Ljava/lang/String;", "startTime", "getStartTime", "startTime$delegate", "Lkotlin/Lazy;", "getType", "()Lcom/example/hw2/Type;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "hw2.app"}
)
@RequiresApi(26)
public final class User {
    @NotNull
    private final Lazy startTime$delegate;
    private final int id;
    @NotNull
    private final String name;
    private int age;
    @NotNull
    private final Type type;

    @NotNull
    public final String getStartTime() {
        Lazy var1 = this.startTime$delegate;
        Object var3 = null;
        return (String)var1.getValue();
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getAge() {
        return this.age;
    }

    public final void setAge(int var1) {
        this.age = var1;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public User(int id, @NotNull String name, int age, @NotNull Type type) {
        super();

        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.startTime$delegate = LazyKt.lazy((Function0)null.INSTANCE);
    }

    // $FF: synthetic method
    public User(int var1, String var2, int var3, Type var4, int var5, DefaultConstructorMarker var6) {
        this(var1, var2, var3, var4);

        if ((var5 & 1) != 0) {
            var1 = 1;
        }

        if ((var5 & 2) != 0) {
            var2 = "John";
        }

        if ((var5 & 4) != 0) {
            var3 = 15;
        }

        if ((var5 & 8) != 0) {
            var4 = Type.DEMO;
        }

    }

    public User() {
        this(0, (String)null, 0, (Type)null, 15, (DefaultConstructorMarker)null);
    }

    public final int component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.age;
    }

    @NotNull
    public final Type component4() {
        return this.type;
    }

    @NotNull
    public final User copy(int id, @NotNull String name, int age, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new User(id, name, age, type);
    }

    // $FF: synthetic method
    public static User copy$default(User var0, int var1, String var2, int var3, Type var4, int var5, Object var6) {
        if ((var5 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var5 & 2) != 0) {
            var2 = var0.name;
        }

        if ((var5 & 4) != 0) {
            var3 = var0.age;
        }

        if ((var5 & 8) != 0) {
            var4 = var0.type;
        }

        return var0.copy(var1, var2, var3, var4);
    }

    @NotNull
    public String toString() {
        return "User(id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", type=" + this.type + ")";
    }

    public int hashCode() {
        int var10000 = Integer.hashCode(this.id) * 31;
        var10000 = ((var10000 + this.name.hashCode()) * 31 + Integer.hashCode(this.age)) * 31;
        return var10000 + this.type.hashCode();
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof User) {
                User var2 = (User)var1;
                if (this.id == var2.id && Intrinsics.areEqual(this.name, var2.name) && this.age == var2.age && Intrinsics.areEqual(this.type, var2.type)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
// UserKt.java
@Metadata(
        mv = {1, 6, 0},
        k = 2,
        d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"},
        d2 = {"isAdult", "", "Lcom/example/hw2/User;", "hw2.app"}
)
final class UserKt {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static final void isAdult(@NotNull User $this$isAdult) {
        Intrinsics.checkNotNullParameter($this$isAdult, "$this$isAdult");
        if ($this$isAdult.getAge() < 18) {
            try {
                throw (Throwable)(new Exception("ERROR: User too young"));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        } else {
            String var1 = "User is adult";
            System.out.println(var1);
        }
    }
}
