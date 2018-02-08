package io.annot8.standards.roles;

import io.annot8.standards.utils.PathUtils;

/**
 * Roles for the groups with type coreference.
 */
public class CoreferenceRoles {

  public static final String PREFIX = "coreference";

  public static final String COREREFERENCE = PathUtils.prefix(PREFIX, "mention");

  protected CoreferenceRoles() {
    // Singleton, but allow other to add additional
  }

}
