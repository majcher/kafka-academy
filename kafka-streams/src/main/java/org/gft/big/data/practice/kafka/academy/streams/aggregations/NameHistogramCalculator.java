package org.gft.big.data.practice.kafka.academy.streams.aggregations;

import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;

public class NameHistogramCalculator {

    public KTable<String, Long> calculateNameHistograms(KStream<?, String> users){
        return null;
    }
}
