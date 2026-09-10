/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.kotlin.compilerplugins.dataclassgenerate;

import org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar;

/**
 * CompilerPluginRegistrar has an abstract pluginId property in Kotlin 2.3+ but not in 2.2. Java
 * method resolution satisfies both; Kotlin cannot.
 */
@SuppressWarnings({"deprecation", "PackageLocationMismatch"})
public abstract class DataClassGenerateComponentRegistrarBase extends CompilerPluginRegistrar {
  public String getPluginId() {
    return "com.facebook.kotlin.dataclassgenerate";
  }
}
