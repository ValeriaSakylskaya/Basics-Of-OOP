package com.task;

import com.task.Enum.SweetType;
import com.task.Enum.WrapType;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private List<Sweet> sweet = new ArrayList<Sweet>();
    private Wrap wrap;

    public Gift() {

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Gift:\nSweets:\n");
        for (Sweet sw : this.sweet) {
            builder.append(sw.toString() + "\n");
        }
        builder.append("Wrap\n");
        builder.append(wrap.toString());
        return builder.toString();
    }

    public static Builder newBuilder() {
        return new Gift().new Builder();
    }

    public class Builder {
        private Builder() {

        }

        public Builder setWrap(WrapType wrapType, double wrappingPrice) {
            Gift.this.wrap = new Wrap(wrapType, wrappingPrice);
            return this;
        }

        public Builder setSweet(SweetType sweetType, double sweetsPrice, double sweetsCount) {
            Gift.this.sweet.add(new Sweet(sweetType, sweetsPrice, sweetsCount));
            return this;
        }

        public Gift build() {
            return Gift.this;
        }

    }
}
