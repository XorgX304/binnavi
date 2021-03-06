// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.Gui.GraphWindows.CommentDialogs.TextNodeComments;

import com.google.security.zynamics.binnavi.Gui.GraphWindows.CommentDialogs.Generic.GenericCommentsTable;
import com.google.security.zynamics.binnavi.Gui.GraphWindows.CommentDialogs.Interfaces.IComment;
import com.google.security.zynamics.binnavi.disassembly.INaviTextNode;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;

/**
 * Panel for the editing of text node comments.
 */
public class TextNodeCommentsPanel extends JPanel {

  private final GenericCommentsTable commentsPanel;

  public TextNodeCommentsPanel(final INaviTextNode textNode) {
    super(new GridLayout(1, 1, 5, 5));

    commentsPanel =
        new GenericCommentsTable(new TextNodeCommentAccessor(textNode), "Text node comment");
    add(commentsPanel);
  }

  public List<IComment> getComment() {
    return commentsPanel.getComment();
  }
}
