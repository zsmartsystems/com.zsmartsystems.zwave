package com.zsmartsystems.zwave.commandclass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a response handler annotation interface for a command class handler.
 * 
 * @author Chris Jackson
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ZWaveResponseHandler {
    /**
     * The command ID for this command
     * 
     * @return
     */
    int id();

    /**
     * The name of the command - used for printing log messages
     * 
     * @return
     */
    String name();
}
