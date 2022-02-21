import React, {Component} from 'react';
import { Link } from 'react-router-dom';
// markdown-editor
import Prism from 'prismjs';
import '@toast-ui/editor/dist/toastui-editor.css';
import { Editor } from '@toast-ui/react-editor';
import '@toast-ui/editor-plugin-code-syntax-highlight/dist/toastui-editor-plugin-code-syntax-highlight.css';
import codeSyntaxHighlight from '@toast-ui/editor-plugin-code-syntax-highlight';

import './WriteStyle.css'

class WriteComponent extends Component {
	render() {
		return(
			<div className='commu-write-component'>
				<form className="markdown-editor">
					<Editor 
							height='100%'
							hideModeSwitch='true'
							placeholder='스터디 정보, 공지 등 스터디를 진행하기 위해 스터디원들이 알아야할 내용을 적어주세요.'
							plugins={[[codeSyntaxHighlight, { highlighter: Prism }]]}/>
					<div>
						<Link to="/commu/list">취소</Link>
						<input type="submit" value="작성하기"/>
					</div>
				</form>
			</div>
		)
	}
}

export default WriteComponent;