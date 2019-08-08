/*
 * Copyright © 2019 T-Mobile USA, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tmobile.sre.pipeline.jenkins.reader

import com.tmobile.sre.pipeline.reader.PipelineFile
import com.tmobile.sre.pipeline.reader.PipelineFileReader

/**
 * Reads local files.
 *
 * @see https://jenkins.io/doc/pipeline/steps/workflow-basic-steps/#-readfile-%20read%20file%20from%20workspace
 */
class JenkinsLocalPipelineFileReader implements PipelineFileReader {
  def jenkinsContext

  JenkinsLocalPipelineFileReader(jenkinsContext) {
    this.jenkinsContext = jenkinsContext
  }

  @Override
  PipelineFile read(String path) {
    new PipelineFile(path, jenkinsContext.readFile(path))
  }
}