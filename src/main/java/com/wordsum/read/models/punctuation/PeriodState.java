package com.wordsum.read.models.punctuation;

import java.util.HashMap;
import java.util.List;


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

public class PeriodState {


    public HashMap<String, String> periodStates;
    public HashMap<String, List<String>> patterns;


    public HashMap<String, String> getPeriodStates() {
        return periodStates;
    }

    public void setPeriodStates(HashMap<String, String> periodStates) {
        this.periodStates = periodStates;
    }

    public HashMap<String, List<String>> getPatterns() {
        return patterns;
    }

    public void setPatterns(HashMap<String, List<String>> patterns) {
        this.patterns = patterns;
    }

    public void addPatterns(String key, List<String> values) {
        this.patterns.put(key, values);
    }

}

