package com.t11e.mediacompressor;

import java.util.List;

public interface IMediaGroup
{
  String getGroupName();

  String getMediaType();

  String getOutputFileName();

  String getOutputFileNameMinified();

  List<String> getSourceFileNames();

  boolean isJslint();
}
