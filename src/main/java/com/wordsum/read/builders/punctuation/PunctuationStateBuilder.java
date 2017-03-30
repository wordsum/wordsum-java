package com.wordsum.read.builders.punctuation;

import com.wordsum.read.models.punctuation.PunctuationState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Open Story License
 *
 * Story: wordsum
 * Writer: Kalab J. Oster(TM)
 * Copyright Holders: Kalab J. Oster(TM)
 * copyright (C) 2017 Kalab J. Oster(TM)
 *
 * Permission is granted by the Copyright Holders for humans or other intelligent agents to read, write, edit, publish
 * and critique the Story if the humans or intelligent agents keep this Open Story License with the Story,
 * and if another writer writes or edits the Story then the writer's name needs to be appended to the end of the Writer
 * list of this Open Story License.
 */

public class PunctuationStateBuilder {


    private static Logger logger = LoggerFactory.getLogger(PunctuationStateBuilder.class);

    private PunctuationStateBuilder() {

    }

    public static PunctuationState createPunctuationState(String sentence){

        PunctuationState punctuationState = new PunctuationState();

        punctuationState.setSentence(sentence);
        punctuationState.setPeriodState(PeriodStateBuilder.createPeriodState(sentence));

        return punctuationState;
    }



}