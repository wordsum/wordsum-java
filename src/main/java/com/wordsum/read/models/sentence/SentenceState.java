package com.wordsum.read.models.sentence;

import com.wordsum.read.models.sentence.structure.StructureState;
import com.wordsum.read.models.sentence.tense.TenseState;
import com.wordsum.read.models.sentence.type.TypeState;

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

public class SentenceState {

    public StructureState structureState;
    public TypeState typeState;
    public TenseState tenseState;

    public StructureState getStructureState() {
        return structureState;
    }

    public void setStructureState(StructureState structureState) {
        this.structureState = structureState;
    }

    public TypeState getTypeState() {
        return typeState;
    }

    public void setTypeState(TypeState typeState) {
        this.typeState = typeState;
    }

    public TenseState getTenseState() {
        return tenseState;
    }

    public void setTenseState(TenseState tenseState) {
        this.tenseState = tenseState;
    }
}
