/*
 * Licensed to Intel Corporation under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * Intel Corporation licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intel.analytics.bigdl.nn

object ErrorInfo {
  final val constrainInputAsVectorOrBatch =
    """
      | The input to the layer needs to be a vector(or a mini-batch of vectors);
      | please use the Reshape module to convert multi-dimensional input into vectors
      | if appropriate"
    """.stripMargin

  final val constrainInputAs3DOrBatch =
    """
      | The input to the layer needs to be a 3D tensor(or a mini-batch of 3D tensors);
      | please use the Reshape module to convert multi-dimensional input into 3D tensors
      | if appropriate"
    """.stripMargin

  final val constrainEachInputAsVectorOrBatch =
    """
      | Each tensor contained in the input to the layer needs to be a vector
      | (or a mini-batch of vectors);\n please use the Reshape module to convert
      | multi-dimensional input into vectors if appropriate""".stripMargin
}
