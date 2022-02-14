package io.mosip.residentapp.entity;

import io.mosip.residentapp.model.KeyValuePair;
import lombok.Data;

/**
 * The Class Score.
 * 
 * @author Manoj SP
 */
@Data
public class MatchDecision {

    /** The match - true or false indicates matchers decision. */
    private boolean match;

    /** The analytics info - detailed breakdown and other information. */
    private KeyValuePair[] analyticsInfo;
}
